package com.google.android.material.internal;

import com.google.android.material.chip.ChipGroup;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import oi.u6;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32693a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f32694b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32695c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f32696d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f32697e;

    /* renamed from: f, reason: collision with root package name */
    public ik.e f32698f;

    public a() {
        this.f32693a = 0;
        this.f32696d = new HashMap();
        this.f32697e = new HashSet();
    }

    public final boolean a(g gVar) {
        int id3 = gVar.getId();
        Set set = (Set) this.f32697e;
        if (set.contains(Integer.valueOf(id3))) {
            return false;
        }
        g gVar2 = (g) ((Map) this.f32696d).get(Integer.valueOf((!this.f32694b || set.isEmpty()) ? -1 : ((Integer) set.iterator().next()).intValue()));
        if (gVar2 != null) {
            c(gVar2, false);
        }
        boolean add = set.add(Integer.valueOf(id3));
        if (!gVar.isChecked()) {
            gVar.setChecked(true);
        }
        return add;
    }

    public final void b() {
        u6 u6Var = (u6) this.f32698f;
        if (u6Var != null) {
            new HashSet((Set) this.f32697e);
            ChipGroup chipGroup = (ChipGroup) u6Var.f95225b;
            int i13 = ChipGroup.f32459j;
            chipGroup.getClass();
        }
    }

    public final boolean c(g gVar, boolean z13) {
        int id3 = gVar.getId();
        Object obj = this.f32697e;
        if (!((Set) obj).contains(Integer.valueOf(id3))) {
            return false;
        }
        if (z13 && ((Set) obj).size() == 1 && ((Set) obj).contains(Integer.valueOf(id3))) {
            gVar.setChecked(true);
            return false;
        }
        boolean remove = ((Set) obj).remove(Integer.valueOf(id3));
        if (gVar.isChecked()) {
            gVar.setChecked(false);
        }
        return remove;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r8 = this;
            int r0 = r8.f32693a
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            boolean r0 = r8.f32694b
            boolean r1 = r8.f32695c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 32
            r2.<init>(r3)
            java.io.Serializable r3 = r8.f32696d
            java.lang.String r3 = (java.lang.String) r3
            r2.append(r3)
            r3 = 123(0x7b, float:1.72E-43)
            r2.append(r3)
            java.lang.Object r3 = r8.f32697e
            gi.m r3 = (gi.m) r3
            java.lang.Object r3 = r3.f65094c
            gi.m r3 = (gi.m) r3
            java.lang.String r4 = ""
        L2b:
            if (r3 == 0) goto Lb7
            java.lang.Object r5 = r3.f65095d
            r6 = 1
            if (r5 != 0) goto L35
            if (r0 != 0) goto Lb1
            goto L7e
        L35:
            if (r1 == 0) goto L7e
            boolean r7 = r5 instanceof java.lang.CharSequence
            if (r7 == 0) goto L46
            r7 = r5
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r7 = r7.length()
            if (r7 != 0) goto L7e
            goto Lb1
        L46:
            boolean r7 = r5 instanceof java.util.Collection
            if (r7 == 0) goto L52
            r7 = r5
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            goto L6a
        L52:
            boolean r7 = r5 instanceof java.util.Map
            if (r7 == 0) goto L5e
            r7 = r5
            java.util.Map r7 = (java.util.Map) r7
            boolean r7 = r7.isEmpty()
            goto L6a
        L5e:
            boolean r7 = r5 instanceof ok.v
            if (r7 == 0) goto L6d
            r7 = r5
            ok.v r7 = (ok.v) r7
            boolean r7 = r7.c()
            r7 = r7 ^ r6
        L6a:
            if (r7 != 0) goto Lb1
            goto L7e
        L6d:
            java.lang.Class r7 = r5.getClass()
            boolean r7 = r7.isArray()
            if (r7 == 0) goto L7e
            int r7 = java.lang.reflect.Array.getLength(r5)
            if (r7 != 0) goto L7e
            goto Lb1
        L7e:
            r2.append(r4)
            java.lang.Object r4 = r3.f65093b
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L8f
            r2.append(r4)
            r4 = 61
            r2.append(r4)
        L8f:
            if (r5 == 0) goto Lac
            java.lang.Class r4 = r5.getClass()
            boolean r4 = r4.isArray()
            if (r4 == 0) goto Lac
            java.lang.Object[] r4 = new java.lang.Object[]{r5}
            java.lang.String r4 = java.util.Arrays.deepToString(r4)
            int r5 = r4.length()
            int r5 = r5 - r6
            r2.append(r4, r6, r5)
            goto Laf
        Lac:
            r2.append(r5)
        Laf:
            java.lang.String r4 = ", "
        Lb1:
            java.lang.Object r3 = r3.f65094c
            gi.m r3 = (gi.m) r3
            goto L2b
        Lb7:
            r0 = 125(0x7d, float:1.75E-43)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.a.toString():java.lang.String");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, int i13) {
        this(str);
        this.f32693a = 1;
    }

    public a(String str) {
        this.f32693a = 1;
        gi.m mVar = new gi.m(9, 0);
        this.f32697e = mVar;
        this.f32698f = mVar;
        this.f32694b = false;
        this.f32695c = false;
        this.f32696d = str;
    }
}
