//package InnerClassProject;
//
//public class AnonymousInnerClass {
//    public static void main(String[] args) {
//        AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass();
//        Wrapping c = anonymousInnerClass.wrapping();
//    }
//
//    public Wrapping wrapping() {       // 不知道为什么不对
//        return new Wrapping() {
//            private int i = 11;
//
//            public int value() {
//                return i;
//            }
//        };
//    }
//}
