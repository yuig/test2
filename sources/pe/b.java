package pe;

import android.view.View;
import android.widget.AdapterView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final qe.c f99887a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f99888b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f99889c;

    /* renamed from: d, reason: collision with root package name */
    public final AdapterView.OnItemClickListener f99890d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f99891e;

    public b(qe.c mapping, View rootView, AdapterView hostView) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.f99887a = mapping;
        this.f99888b = new WeakReference(hostView);
        this.f99889c = new WeakReference(rootView);
        this.f99890d = hostView.getOnItemClickListener();
        this.f99891e = true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
        Intrinsics.checkNotNullParameter(view, "view");
        AdapterView.OnItemClickListener onItemClickListener = this.f99890d;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(adapterView, view, i13, j13);
        }
        View view2 = (View) this.f99889c.get();
        AdapterView adapterView2 = (AdapterView) this.f99888b.get();
        if (view2 == null || adapterView2 == null) {
            return;
        }
        c.a(this.f99887a, view2, adapterView2);
    }
}
