package com.pinterest.ui.brio.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import j60.b;

@Deprecated
/* loaded from: classes4.dex */
public class MultiUserAvatar extends FrameLayout {
    public MultiUserAvatar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MultiUserAvatar(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        View.inflate(getContext(), b.multi_user_avatar, this);
    }
}
