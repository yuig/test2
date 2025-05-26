package zn1;

import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import im1.k;
import im1.o;
import kotlin.jvm.internal.Intrinsics;
import yq0.c0;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final TextWatcher f142291a;

    /* renamed from: b, reason: collision with root package name */
    public final View.OnClickListener f142292b;

    /* renamed from: c, reason: collision with root package name */
    public final View.OnClickListener f142293c;

    /* renamed from: d, reason: collision with root package name */
    public final View.OnFocusChangeListener f142294d;

    /* renamed from: e, reason: collision with root package name */
    public final View.OnClickListener f142295e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView.OnEditorActionListener f142296f;

    /* renamed from: g, reason: collision with root package name */
    public final View.OnKeyListener f142297g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f142298h;

    public c(o textWatcher, c0 startIconOnClickListener, fd1.e eVar, im1.b onFocusChangeListener, im1.g onClickListener, k onEditorActionListener, im1.h onKeyListener) {
        Intrinsics.checkNotNullParameter(textWatcher, "textWatcher");
        Intrinsics.checkNotNullParameter(startIconOnClickListener, "startIconOnClickListener");
        Intrinsics.checkNotNullParameter(onFocusChangeListener, "onFocusChangeListener");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        Intrinsics.checkNotNullParameter(onEditorActionListener, "onEditorActionListener");
        Intrinsics.checkNotNullParameter(onKeyListener, "onKeyListener");
        this.f142291a = textWatcher;
        this.f142292b = startIconOnClickListener;
        this.f142293c = eVar;
        this.f142294d = onFocusChangeListener;
        this.f142295e = onClickListener;
        this.f142296f = onEditorActionListener;
        this.f142297g = onKeyListener;
        this.f142298h = false;
    }

    public final View.OnClickListener a() {
        return this.f142293c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f142291a, cVar.f142291a) && Intrinsics.d(this.f142292b, cVar.f142292b) && Intrinsics.d(this.f142293c, cVar.f142293c) && Intrinsics.d(this.f142294d, cVar.f142294d) && Intrinsics.d(this.f142295e, cVar.f142295e) && Intrinsics.d(this.f142296f, cVar.f142296f) && Intrinsics.d(this.f142297g, cVar.f142297g) && this.f142298h == cVar.f142298h;
    }

    public final int hashCode() {
        int hashCode = (this.f142292b.hashCode() + (this.f142291a.hashCode() * 31)) * 31;
        View.OnClickListener onClickListener = this.f142293c;
        return Boolean.hashCode(this.f142298h) + ((this.f142297g.hashCode() + ((this.f142296f.hashCode() + ((this.f142295e.hashCode() + ((this.f142294d.hashCode() + ((hashCode + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Listeners(textWatcher=" + this.f142291a + ", startIconOnClickListener=" + this.f142292b + ", endIconOnClickListener=" + this.f142293c + ", onFocusChangeListener=" + this.f142294d + ", onClickListener=" + this.f142295e + ", onEditorActionListener=" + this.f142296f + ", onKeyListener=" + this.f142297g + ", textWatcherAdded=" + this.f142298h + ")";
    }
}
