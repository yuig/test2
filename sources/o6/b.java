package o6;

import android.view.View;
import java.util.WeakHashMap;
import q5.v0;

/* loaded from: classes3.dex */
public final class b extends d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f92915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f92916f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, a aVar2) {
        super(0);
        this.f92915e = aVar;
        this.f92916f = aVar2;
    }

    @Override // o6.d
    public final int e(View view, int i13, int i14) {
        WeakHashMap weakHashMap = v0.f102521a;
        return (view.getLayoutDirection() == 1 ? this.f92916f : this.f92915e).e(view, i13, i14);
    }

    @Override // o6.d
    public final String g() {
        return "SWITCHING[L:" + this.f92915e.g() + ", R:" + this.f92916f.g() + "]";
    }

    @Override // o6.d
    public final int i(View view, int i13) {
        WeakHashMap weakHashMap = v0.f102521a;
        return (view.getLayoutDirection() == 1 ? this.f92916f : this.f92915e).i(view, i13);
    }
}
