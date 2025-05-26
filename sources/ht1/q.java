package ht1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q implements et1.e {

    /* renamed from: a, reason: collision with root package name */
    public final et1.e0 f70305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ et1.c f70306b;

    /* renamed from: c, reason: collision with root package name */
    public it1.a f70307c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f70308d;

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f70309e;

    /* renamed from: f, reason: collision with root package name */
    public int f70310f;

    /* renamed from: g, reason: collision with root package name */
    public nt1.c f70311g;

    /* renamed from: h, reason: collision with root package name */
    public ByteOrder f70312h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f70313i;

    /* renamed from: j, reason: collision with root package name */
    public Long f70314j;

    /* renamed from: k, reason: collision with root package name */
    public long f70315k;

    /* renamed from: l, reason: collision with root package name */
    public nt1.e f70316l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f70317m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f70318n;

    /* renamed from: o, reason: collision with root package name */
    public final o f70319o;

    /* renamed from: p, reason: collision with root package name */
    public final p f70320p;

    /* renamed from: q, reason: collision with root package name */
    public final p f70321q;

    /* renamed from: r, reason: collision with root package name */
    public final b f70322r;

    public q(et1.c subcomponent, et1.e0 ringByteBufferFactory) {
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(ringByteBufferFactory, "ringByteBufferFactory");
        this.f70305a = ringByteBufferFactory;
        this.f70306b = subcomponent;
        ByteOrder byteOrder = ByteOrder.nativeOrder();
        Intrinsics.checkNotNullExpressionValue(byteOrder, "nativeOrder(...)");
        ringByteBufferFactory.getClass();
        Intrinsics.checkNotNullParameter(byteOrder, "byteOrder");
        this.f70307c = new it1.a(new byte[8192], 0, 0, byteOrder);
        o oVar = new o(this);
        this.f70319o = oVar;
        p pVar = new p(this);
        this.f70320p = pVar;
        this.f70321q = pVar;
        b bVar = new b(1);
        this.f70322r = bVar;
        et1.v0 v0Var = (et1.v0) subcomponent;
        v0Var.a(oVar, "Queue Audio");
        v0Var.a(pVar, "Send Audio");
        v0Var.a(bVar, "On Queued Frame Count Changed");
    }

    @Override // et1.e
    public final String d(Object obj) {
        return ((et1.v0) this.f70306b).d(obj);
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((et1.v0) this.f70306b).h(callback);
    }

    @Override // et1.e
    public final void j(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f70306b.j(callback);
    }

    public final String toString() {
        int x13;
        boolean z13 = this.f70308d;
        boolean z14 = this.f70317m;
        boolean z15 = this.f70318n;
        nt1.c cVar = this.f70311g;
        if (cVar == null) {
            Intrinsics.r("audioFormat");
            throw null;
        }
        ByteOrder byteOrder = this.f70312h;
        if (byteOrder == null) {
            Intrinsics.r("byteOrder");
            throw null;
        }
        Long l13 = this.f70314j;
        Integer num = this.f70313i;
        long j13 = this.f70315k;
        int i13 = this.f70307c.f73677d;
        if (i13 == 0) {
            x13 = 0;
        } else {
            if (cVar == null) {
                Intrinsics.r("audioFormat");
                throw null;
            }
            x13 = l3.c.x(i13, cVar);
        }
        return "Audio Queue: initialized? [" + z13 + "] input done? [" + z14 + "] done producing? [" + z15 + "] format [" + cVar + "] byte order [" + byteOrder + "] timestamp of first received audio sample [" + l13 + "] frame count of last send packet [" + num + "] total sent audio frames [" + j13 + "] queued frame count [" + x13 + "]";
    }
}
