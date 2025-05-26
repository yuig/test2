package e2;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.k0;

/* loaded from: classes2.dex */
public final class s extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final int f56901a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f56902b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f56903c;

    /* renamed from: d, reason: collision with root package name */
    public final u f56904d;

    /* renamed from: e, reason: collision with root package name */
    public int f56905e;

    public s(Context context) {
        super(context);
        this.f56901a = 5;
        ArrayList arrayList = new ArrayList();
        this.f56902b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f56903c = arrayList2;
        this.f56904d = new u();
        setClipChildren(false);
        v vVar = new v(context);
        addView(vVar);
        arrayList.add(vVar);
        arrayList2.add(vVar);
        this.f56905e = 1;
        setTag(u2.s.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final v a(t tVar) {
        u uVar = this.f56904d;
        v vVar = (v) uVar.f56906a.get(tVar);
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = (v) k0.A(this.f56903c);
        Map map = uVar.f56906a;
        Map map2 = uVar.f56907b;
        if (vVar2 == null) {
            int i13 = this.f56905e;
            ArrayList arrayList = this.f56902b;
            if (i13 > kotlin.collections.f0.i(arrayList)) {
                vVar2 = new v(getContext());
                addView(vVar2);
                arrayList.add(vVar2);
            } else {
                vVar2 = (v) arrayList.get(this.f56905e);
                t tVar2 = (t) map2.get(vVar2);
                if (tVar2 != null) {
                    tVar2.d0();
                    v vVar3 = (v) map.get(tVar2);
                    if (vVar3 != null) {
                    }
                    map.remove(tVar2);
                    vVar2.b();
                }
            }
            int i14 = this.f56905e;
            if (i14 < this.f56901a - 1) {
                this.f56905e = i14 + 1;
            } else {
                this.f56905e = 0;
            }
        }
        map.put(tVar, vVar2);
        map2.put(vVar2, tVar);
        return vVar2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
