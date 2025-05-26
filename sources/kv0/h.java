package kv0;

import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final h f80965j = new h(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h f80966k = new h(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80967i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13) {
        super(2);
        this.f80967i = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f80967i;
        switch (i13) {
            case 0:
                u uVar = (u) obj;
                u uVar2 = (u) obj2;
                switch (i13) {
                    case 0:
                        return Integer.valueOf(-Boolean.compare(uVar.f81018h, uVar2.f81018h));
                    default:
                        return Integer.valueOf(Boolean.compare(uVar.f81018h, uVar2.f81018h));
                }
            default:
                u uVar3 = (u) obj;
                u uVar4 = (u) obj2;
                switch (i13) {
                    case 0:
                        return Integer.valueOf(-Boolean.compare(uVar3.f81018h, uVar4.f81018h));
                    default:
                        return Integer.valueOf(Boolean.compare(uVar3.f81018h, uVar4.f81018h));
                }
        }
    }
}
