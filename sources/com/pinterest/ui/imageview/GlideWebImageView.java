package com.pinterest.ui.imageview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import de.c;
import ey.j3;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s81.g;
import uz1.x;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/ui/imageview/GlideWebImageView;", "Lcom/pinterest/ui/imageview/GenericWebImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "images_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class GlideWebImageView extends GenericWebImageView {
    public static final /* synthetic */ int F = 0;
    public c E;

    public GlideWebImageView(Context context) {
        super(context);
        s2();
        this.f52567s = new x(r2(), 1);
        this.f52568t = true;
        this.f52574z = s92.c.UNKNOWN;
        Function1 function1 = j3.f60518i;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.A = (d4) function1.invoke(context2);
        this.B = true;
    }

    @Override // com.pinterest.ui.imageview.GenericWebImageView, ee.i
    /* renamed from: K0, reason: from getter */
    public final c getF44637j() {
        return this.E;
    }

    @Override // com.pinterest.ui.imageview.GenericWebImageView, ee.i
    public final void Z(c cVar) {
        this.E = cVar;
    }

    @Override // com.pinterest.ui.imageview.GenericWebImageView, hs1.a, ee.i
    public final void s(Drawable drawable) {
        Handler handler;
        hs1.c cVar = this.f52564p;
        if (cVar == null || (handler = getHandler()) == null) {
            return;
        }
        handler.post(new g(cVar, 21));
    }

    public GlideWebImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GlideWebImageView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
    }
}
