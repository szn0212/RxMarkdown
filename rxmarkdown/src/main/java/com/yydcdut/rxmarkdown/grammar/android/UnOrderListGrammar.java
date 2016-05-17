package com.yydcdut.rxmarkdown.grammar.android;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.BulletSpan;

/**
 * Created by yuyidong on 16/5/4.
 */
class UnOrderListGrammar extends AbsAndroidGrammar {
    private static final String KEY_0 = "* ";
    private static final String KEY_1 = "+ ";
    private static final String KEY_2 = "- ";

    private static final int START_POSITION = 2;

    @Override
    public boolean isMatch(@NonNull String text) {
        if (TextUtils.isEmpty(text)) {
            return false;
        }
        return text.startsWith(KEY_0) ||
                text.startsWith(KEY_1) ||
                (text.startsWith(KEY_2));
    }

    @NonNull
    @Override
    public SpannableStringBuilder format(@NonNull SpannableStringBuilder ssb) {
        if (ssb == null) {
            return new SpannableStringBuilder("");
        }
        String text = ssb.toString();
        if (TextUtils.isEmpty(text)) {
            return ssb;
        }
        if (!isMatch(text)) {
            return ssb;
        }
        ssb.delete(0, START_POSITION);
        ssb.setSpan(new BulletSpan(10, Color.BLACK), 0, ssb.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return ssb;
    }

    @Override
    public String toString() {
        return "UnOrderListGrammar{}";
    }
}
