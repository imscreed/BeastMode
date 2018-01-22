package Rough;

import java.util.Scanner;

/**
 * Created by Ibrahim on 2017-06-29.
 */
public class ListenerTest {
    public static void main(String[] args){
        Repl rep = new Repl();
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        rep.reply(a);
    }
}

class Repl implements ReplyAIListener {
    @Override
    public void reply(String s) {
        System.out.println("Hello there "+ s);
    }
}

interface ReplyAIListener {
    void reply(String s);
}
