package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Prob0116_populating_next_right_pointers_in_each_node {
    public Node connect(Node root) { // bfs
        if (root == null)
            return null;
        Stack<List<Node>> stack = new Stack<>();
        stack.add(List.of(root));
        List<Node> tempList, poppedRes;
        while (!stack.isEmpty()) {
            tempList = new ArrayList<>();
            poppedRes = stack.pop();
            if (poppedRes.get(0) == null)
                break;
            tempList.add(poppedRes.get(0).left);
            tempList.add(poppedRes.get(0).right);
            for (int i = 1; i < poppedRes.size(); i++) {
                poppedRes.get(i - 1).next = poppedRes.get(i);
                tempList.add(poppedRes.get(i).left);
                tempList.add(poppedRes.get(i).right);
            }
            stack.add(tempList);
        }
        return root;
    }

}
