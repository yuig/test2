package com.pinterest.ui.imageview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import ao2.m0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o80.k;
import o80.m;
import qy.a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001d\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/ui/imageview/WebImageView;", "Lcom/pinterest/ui/imageview/GlideWebImageView;", "Lqy/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "m60/f0", "images_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class WebImageView extends GlideWebImageView implements a {
    public static final /* synthetic */ int I = 0;
    public m G;
    public final boolean H;

    public WebImageView(Context context) {
        super(context);
        this.H = true;
    }

    @Override // qy.a
    public final String coexistId() {
        String str = this.f52563o;
        return str == null ? "" : str;
    }

    @Override // qy.a
    public final int getPWTImageX() {
        if (!m0.f20172b || m0.J()) {
            return (int) getX();
        }
        return 0;
    }

    @Override // qy.a
    public final int getPWTImageY() {
        if (!m0.f20172b || m0.J()) {
            return (int) getY();
        }
        return 0;
    }

    @Override // qy.a
    /* renamed from: getShouldTrackPWT, reason: from getter */
    public final boolean getY2() {
        return this.H;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean onTouchEvent = super.onTouchEvent(event);
        m mVar = this.G;
        return mVar != null ? onTouchEvent | ((k) mVar).a(event) : onTouchEvent;
    }

    public WebImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = true;
    }

    public WebImageView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.H = true;
    }
}
