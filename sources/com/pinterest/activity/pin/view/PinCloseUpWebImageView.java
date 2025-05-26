package com.pinterest.activity.pin.view;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gn;
import com.pinterest.api.model.um;
import is1.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y0.r;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/activity/pin/view/PinCloseUpWebImageView;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "g4/u", "closeupImageViewLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class PinCloseUpWebImageView extends WebView {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f34982d = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f34983a;

    /* renamed from: b, reason: collision with root package name */
    public Object f34984b;

    /* renamed from: c, reason: collision with root package name */
    public String f34985c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinCloseUpWebImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void a(um umVar) {
        f30 f30Var = umVar.f42584a;
        Boolean valueOf = Boolean.valueOf(b40.D0(f30Var));
        gn m43 = f30Var.m4();
        String f13 = m43 != null ? m43.f() : null;
        if (Intrinsics.d(umVar, this.f34984b)) {
            return;
        }
        this.f34984b = umVar;
        if (!this.f34983a) {
            setVerticalScrollBarEnabled(false);
            setHorizontalScrollBarEnabled(false);
            getSettings().setSupportMultipleWindows(false);
            getSettings().setCacheMode(-1);
            setFocusable(false);
            k0.f73618b = true;
            this.f34983a = true;
        }
        if (!Intrinsics.d(valueOf, Boolean.TRUE)) {
            f13 = umVar.f42586c;
        }
        new Thread(new r(f13, this, umVar.f42589f)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return false;
    }

    public /* synthetic */ PinCloseUpWebImageView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCloseUpWebImageView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context.getApplicationContext(), attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
