package pages

import geb.Page

class DragAndDropPage extends Page{

    static url ="/droppable/"

    static content = {
    // adding navigator
        draggable {$("#draggable")}
        droppable {$("#droppable")}
        iframeElement {$("#content iframe")}
    }

    def dragElement(){
        withFrame(iframeElement){
            interact {
                dragAndDrop(draggable,droppable)
            }
        }
    }
}
