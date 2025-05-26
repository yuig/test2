package jp;

import ep.n;
import gi.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77239i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f77240j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i13) {
        super(0);
        this.f77239i = i13;
        this.f77240j = cVar;
    }

    public final com.pinterest.framework.multisection.datasource.pagedlist.g b() {
        int i13 = this.f77239i;
        c cVar = this.f77240j;
        switch (i13) {
            case 0:
                return new m(cVar.f77242a, n.BOARDS).s();
            default:
                return new m(cVar.f77242a, n.CONTACTS).s();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f77239i) {
        }
        return b();
    }
}
