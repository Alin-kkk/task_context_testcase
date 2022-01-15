# task_context_testcase
## testcase1
First, we select the class TestView and the field ID. Then we choose a 1-step prediction. After assigning a stereotype for each code element and pattern matching, we obtain all matched subgraphs. Since the class TestView is the initial code element, we will not recommend it. Finally, we calculate the expected prediction code elements and their confidence.
![avatar](https://raw.githubusercontent.com/alin-kk/task_context_testcase/main/testcase1.png)
## testcase2
Similarly, we also select class TestView and field ID in test case 2, Then we choose 2-step prediction. And finally, we obtain the expected prediction code elements and their confidence.
![avatar](https://raw.githubusercontent.com/alin-kk/task_context_testcase/main/testcase2.png)
## testcase3
![avatar](https://raw.githubusercontent.com/alin-kk/task_context_testcase/main/testcase3.png)
In test case 3, we select the class ASTViewImages and field ICONS_PATH. Then we choose a 3-step prediction. As shown in the photo, there are two successfully matched subgraphs. Since the two matched subgraphs contain method setImageDescriptor, method create, and method createImageDescriptor, all the confidence of the three methods are 1.
