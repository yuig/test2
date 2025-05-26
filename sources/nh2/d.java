package nh2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class d extends p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90561a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, int i13) {
        super(0, eVar, e.class, "incrementAndCheckAttachmentLimit", "incrementAndCheckAttachmentLimit()Z", 0);
        this.f90561a = i13;
        if (i13 != 1) {
        } else {
            super(0, eVar, e.class, "incrementAndCheckAttachmentLimit", "incrementAndCheckAttachmentLimit()Z", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f90561a;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        e eVar = (e) this.receiver;
                        return Boolean.valueOf(eVar.f90563b.incrementAndGet() <= eVar.f90562a);
                    default:
                        e eVar2 = (e) this.receiver;
                        return Boolean.valueOf(eVar2.f90563b.incrementAndGet() <= eVar2.f90562a);
                }
            default:
                switch (i13) {
                    case 0:
                        e eVar3 = (e) this.receiver;
                        return Boolean.valueOf(eVar3.f90563b.incrementAndGet() <= eVar3.f90562a);
                    default:
                        e eVar4 = (e) this.receiver;
                        return Boolean.valueOf(eVar4.f90563b.incrementAndGet() <= eVar4.f90562a);
                }
        }
    }
}
