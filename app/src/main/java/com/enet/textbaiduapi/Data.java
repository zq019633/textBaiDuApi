package com.enet.textbaiduapi;

import java.util.List;

/**
 * Created by zhouqiang on 2017/2/28.
 */

public class Data {
    /**
     * errno : 0
     * err_no : 0
     * errmas :
     * ret : []
     * errNum : 0
     * errMsg : success
     * querySign : 4133219207,2531900678
     * retData : [{"rect":{"left":"7","top":"9","width":"12","height":"15"},"word":"8","charset":[]}]
     */

    private int errno;
    private int err_no;
    private String errmas;
    private String errNum;
    private String errMsg;
    private String querySign;
    private List<?> ret;
    private List<RetDataEntity> retData;

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public int getErr_no() {
        return err_no;
    }

    public void setErr_no(int err_no) {
        this.err_no = err_no;
    }

    public String getErrmas() {
        return errmas;
    }

    public void setErrmas(String errmas) {
        this.errmas = errmas;
    }

    public String getErrNum() {
        return errNum;
    }

    public void setErrNum(String errNum) {
        this.errNum = errNum;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getQuerySign() {
        return querySign;
    }

    public void setQuerySign(String querySign) {
        this.querySign = querySign;
    }

    public List<?> getRet() {
        return ret;
    }

    public void setRet(List<?> ret) {
        this.ret = ret;
    }

    public List<RetDataEntity> getRetData() {
        return retData;
    }

    public void setRetData(List<RetDataEntity> retData) {
        this.retData = retData;
    }

    public static class RetDataEntity {
        /**
         * rect : {"left":"7","top":"9","width":"12","height":"15"}
         * word : 8
         * charset : []
         */

        private RectEntity rect;
        private String word;
        private List<?> charset;

        public RectEntity getRect() {
            return rect;
        }

        public void setRect(RectEntity rect) {
            this.rect = rect;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public List<?> getCharset() {
            return charset;
        }

        public void setCharset(List<?> charset) {
            this.charset = charset;
        }

        public static class RectEntity {
            /**
             * left : 7
             * top : 9
             * width : 12
             * height : 15
             */

            private String left;
            private String top;
            private String width;
            private String height;

            public String getLeft() {
                return left;
            }

            public void setLeft(String left) {
                this.left = left;
            }

            public String getTop() {
                return top;
            }

            public void setTop(String top) {
                this.top = top;
            }

            public String getWidth() {
                return width;
            }

            public void setWidth(String width) {
                this.width = width;
            }

            public String getHeight() {
                return height;
            }

            public void setHeight(String height) {
                this.height = height;
            }
        }
    }
}
