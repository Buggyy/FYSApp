package regex;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

class JTextFieldLimit extends PlainDocument {
  private int limit;
  
  /**
   * 
   * @param limit 
   */
  public JTextFieldLimit(int limit) {
    super();
    this.limit = limit;
  }

  /**
   * 
   * @param limit
   * @param upper 
   */
  public JTextFieldLimit(int limit, boolean upper) {
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
    if (str == null)
      return;

    if ((getLength() + str.length()) <= limit) {
      super.insertString(offset, str, attr);
    }
  }
}