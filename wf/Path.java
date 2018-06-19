package com.itrexgroup.wf;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class Path {
    private String path;

    public Path(String path) {
        this.path = path;
    }

    public static void main(String[] args) {
        Path path = new Path("/a/b/c/d");
        path.cd("../x");
        System.out.println(path.getPath());
    }

    public String getPath() {
        return path;
    }

    public void cd(String newPath) {

        if (newPath.equals("/")) {
            path = newPath;
        } else {
            newPath = newPath.replaceAll("\\s", "");
            String[] stringListSplited = newPath.split("/");
            List<String> list = Arrays.asList(stringListSplited);
            ArrayDeque<String> newDeque = new ArrayDeque<>(list);
            if (newDeque.getFirst().isEmpty()) {
                newDeque.removeFirst();
            }

            path = path.replaceAll("\\s", "");
            stringListSplited = path.split("/");
            list = Arrays.asList(stringListSplited);
            ArrayDeque<String> pathDeque = new ArrayDeque<>(list);
            if (pathDeque.getFirst().isEmpty()) {
                pathDeque.removeFirst();
            }

            while (!newDeque.isEmpty()) {
                if (newDeque.getFirst().equals("..")) {
                    pathDeque.removeLast();
                } else {
                    pathDeque.addLast(newDeque.getFirst());
                }
                newDeque.removeFirst();
            }

            path = "";
            while (!pathDeque.isEmpty()) {
                path += "/" + pathDeque.removeFirst();
            }
        }
    }
}