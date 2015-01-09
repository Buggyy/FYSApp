package regex;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

class JTextField extends PlainDocument {

    private int limit;

    /**
     *
     * @param limit
     */
    public JTextField(int limit) {
        super();
        this.limit = limit;
    }

    /**
     *
     * @param limit
     * @param upper
     */
    public JTextField(int limit, boolean upper) {
        super();
        this.limit = limit;
    }

    /**
     *
     * @param offset
     * @param str
     * @param attr
     * @throws BadLocationException
     */
    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null) {
            return;
        }

        if ((getLength() + str.length()) <= limit) {
            super.insertString(offset, str, attr);
        }
    }

    /**
     *
     * @param texts
     * @return
     */
    public static boolean areAllNotEmpty(String... texts) {
        for (String s : texts) {
            if (s == null || "".equals(s)) {
                return false;
            }
        }
        return true;
    }

}
