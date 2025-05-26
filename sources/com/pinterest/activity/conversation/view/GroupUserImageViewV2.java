package com.pinterest.activity.conversation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import kh2.m0;
import rl1.r;

@Deprecated
/* loaded from: classes3.dex */
public class GroupUserImageViewV2 extends RelativeLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f34882b = 0;

    /* renamed from: a, reason: collision with root package name */
    public GestaltAvatar f34883a;

    public GroupUserImageViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final GestaltAvatar a() {
        if (this.f34883a == null) {
            GestaltAvatar m13 = m0.m(getContext(), r.LG, true);
            this.f34883a = m13;
            addView(m13);
        }
        return this.f34883a;
    }

    public GroupUserImageViewV2(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
    }
}
