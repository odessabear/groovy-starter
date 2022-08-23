package com.odebar.practice

class Task2 {
    static void main(String[] args) {

        Integer.metaClass {
            getCm = {
                delegate * 10
            }

            getM = {
                delegate.cm * 100
            }

            getMm = {
                delegate
            }
        }

//        Integer.metaClass.getCm = {
//            delegate * 10
//        }
//
//        Integer.metaClass.getM = {
//            delegate.cm * 100
//        }
//
//        Integer.metaClass.getMm = {
//            delegate
//        }

        def result = 3.cm + 1.m - 25.mm
        assert result == 1005
    }

    private static Object firstOption() {
        use(IntegerMethods) {
            def result = 3.cm + 1.m - 25.mm
            assert result == 1005
        }
    }
}
