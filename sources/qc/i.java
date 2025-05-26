package qc;

import java.util.ArrayList;
import java.util.List;
import wo2.l;
import wo2.m;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f103433a;

    /* renamed from: b, reason: collision with root package name */
    public final List f103434b;

    /* renamed from: c, reason: collision with root package name */
    public final l f103435c;

    /* renamed from: d, reason: collision with root package name */
    public final m f103436d;

    public i(int i13, ArrayList arrayList, l lVar, m mVar) {
        this.f103433a = i13;
        this.f103434b = arrayList;
        this.f103435c = lVar;
        this.f103436d = mVar;
    }

    public final l a() {
        l lVar = this.f103435c;
        if (lVar != null) {
            return lVar;
        }
        m mVar = this.f103436d;
        if (mVar == null) {
            return null;
        }
        wo2.j jVar = new wo2.j();
        jVar.S(mVar);
        return jVar;
    }
}
