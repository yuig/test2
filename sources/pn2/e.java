package pn2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a1 f100782i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ sn2.k f100783j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ sn2.g f100784k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ sn2.g f100785l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a1 a1Var, sn2.k kVar, sn2.g gVar, sn2.g gVar2) {
        super(0);
        this.f100782i = a1Var;
        this.f100783j = kVar;
        this.f100784k = gVar;
        this.f100785l = gVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(g.m(this.f100782i, this.f100783j.E(this.f100784k), this.f100785l));
    }
}
