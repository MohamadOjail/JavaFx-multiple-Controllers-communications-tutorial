# JavaFx multiple Controllers communications. – (tutorial)
The example shows how to establish communication between multiple Controllers assuming that the application is built on a FXML GUI that includes other nested FXML files.
> What do we want to achieve:

- Inject sub FXML files into the parent FXML.
- Create instance of the controllers into each of the other ones.
- Call methods that exist in a controller from another one.


------------

> Solution:

Since we are using nested FXML files as shown in the picture here:
![](/images/structure.jpg)
We need to give an fx:id to the pane holding all the contents of each sub FXML file, this fx:id will be added manually (unfortunately) to the parent FXML file:
```java
<fx:include fx:id="right" source="RightPane.fxml" />
```
This will allow the injecting of the sub FXMLs Controllers into the Main Controller:
```java
@FXML private LeftPaneController leftController;
```
All what’s left is just to create public methods in the child Controllers to inject the desired Controller, and call these methods at the initializing of the main Controller:

```java
@FXML private void initialize() {
		leftController.injectRightPaneController(rightController);
		rightController.injectLeftPaneController(leftController);
	}
```


```java
private RightPaneController rightPaneController;
	
	public void injectRightPaneController(RightPaneController rightPaneController) {
		this.rightPaneController = rightPaneController;
	}
```

## Demo:
![](/images/demo.gif)
