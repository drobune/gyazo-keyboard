package drobune.gyazo_keyboard;

/**
 * Created by drobune on 12/16/15.
 */
public class gyazoIME extends InputMethodService {
    implements OnKeyboardActionListener{

        private KeyboardView kv;
        private Keyboard keyboard;

        private boolean caps = false;

        @Override
        public void onKey(int primaryCode, int[] keyCodes) {

        }

        @Override
        public void onPress(int primaryCode) {
        }

        @Override
        public void onRelease(int primaryCode) {
        }

        @Override
        public void onText(CharSequence text) {
        }

        @Override
        public void swipeDown() {
        }

        @Override
        public void swipeLeft() {
        }

        @Override
        public void swipeRight() {
        }

        @Override
        public void swipeUp() {
        }

        @Override
        public View onCreateInputView() {
            MyKeyboardView inputView =
                    (MyKeyboardView) getLayoutInflater().inflate( R.layout.input, null);

            inputView.setOnKeyboardActionListener(this);
            inputView.setKeyboard(mLatinKeyboard);

            return mInputView;
        }

}
