package mj;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f87237a;

    /* renamed from: b, reason: collision with root package name */
    public final float f87238b;

    /* renamed from: d, reason: collision with root package name */
    public i f87240d;

    /* renamed from: e, reason: collision with root package name */
    public i f87241e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f87239c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f87242f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f87243g = -1;

    /* renamed from: h, reason: collision with root package name */
    public float f87244h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f87245i = -1;

    public h(float f13, float f14) {
        this.f87237a = f13;
        this.f87238b = f14;
    }

    public final void a(float f13, float f14, float f15, boolean z13, boolean z14) {
        float f16;
        float f17 = f15 / 2.0f;
        float f18 = f13 - f17;
        float f19 = f17 + f13;
        float f23 = this.f87238b;
        if (f19 > f23) {
            f16 = Math.abs(f19 - Math.max(f19 - f15, f23));
        } else {
            f16 = 0.0f;
            if (f18 < 0.0f) {
                f16 = Math.abs(f18 - Math.min(f18 + f15, 0.0f));
            }
        }
        b(f13, f14, f15, z13, z14, f16, 0.0f, 0.0f);
    }

    public final void b(float f13, float f14, float f15, boolean z13, boolean z14, float f16, float f17, float f18) {
        if (f15 <= 0.0f) {
            return;
        }
        ArrayList arrayList = this.f87239c;
        if (z14) {
            if (z13) {
                throw new IllegalArgumentException("Anchor keylines cannot be focal.");
            }
            int i13 = this.f87245i;
            if (i13 != -1 && i13 != 0) {
                throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
            }
            this.f87245i = arrayList.size();
        }
        i iVar = new i(Float.MIN_VALUE, f13, f14, f15, z14, f16, f17, f18);
        if (z13) {
            if (this.f87240d == null) {
                this.f87240d = iVar;
                this.f87242f = arrayList.size();
            }
            if (this.f87243g != -1 && arrayList.size() - this.f87243g > 1) {
                throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
            }
            if (f15 != this.f87240d.f87249d) {
                throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
            }
            this.f87241e = iVar;
            this.f87243g = arrayList.size();
        } else {
            if (this.f87240d == null && f15 < this.f87244h) {
                throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
            }
            if (this.f87241e != null && f15 > this.f87244h) {
                throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
            }
        }
        this.f87244h = f15;
        arrayList.add(iVar);
    }

    public final void c(float f13, float f14, float f15, int i13, boolean z13) {
        if (i13 <= 0 || f15 <= 0.0f) {
            return;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            a((i14 * f15) + f13, f14, f15, z13, false);
        }
    }

    public final j d() {
        if (this.f87240d == null) {
            throw new IllegalStateException("There must be a keyline marked as focal.");
        }
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = this.f87239c;
            int size = arrayList2.size();
            float f13 = this.f87237a;
            if (i13 >= size) {
                return new j(f13, arrayList, this.f87242f, this.f87243g);
            }
            i iVar = (i) arrayList2.get(i13);
            arrayList.add(new i((i13 * f13) + (this.f87240d.f87247b - (this.f87242f * f13)), iVar.f87247b, iVar.f87248c, iVar.f87249d, iVar.f87250e, iVar.f87251f, iVar.f87252g, iVar.f87253h));
            i13++;
        }
    }
}
