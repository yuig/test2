package de1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class v extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54660a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Object obj, int i13) {
        super(1, obj, x.class, "maybeLogSectionRender", "maybeLogSectionRender(I)V", 0);
        this.f54660a = i13;
        if (i13 == 1) {
            super(1, obj, x.class, "maybeLogSectionRender", "maybeLogSectionRender(I)V", 0);
            return;
        }
        if (i13 == 2) {
            super(1, obj, x.class, "maybeLogSectionRender", "maybeLogSectionRender(I)V", 0);
            return;
        }
        if (i13 == 3) {
            super(1, obj, a0.class, "maybeLogSectionRender", "maybeLogSectionRender(I)V", 0);
            return;
        }
        if (i13 == 4) {
            super(1, obj, a0.class, "maybeLogSectionRender", "maybeLogSectionRender(I)V", 0);
        } else if (i13 != 5) {
        } else {
            super(1, obj, a0.class, "maybeLogSectionRender", "maybeLogSectionRender(I)V", 0);
        }
    }

    public final void h(int i13) {
        switch (this.f54660a) {
            case 0:
                x.D3((x) this.receiver, i13);
                break;
            case 1:
                x.D3((x) this.receiver, i13);
                break;
            case 2:
                x.D3((x) this.receiver, i13);
                break;
            case 3:
                a0.D3((a0) this.receiver, i13);
                break;
            case 4:
                a0.D3((a0) this.receiver, i13);
                break;
            default:
                a0.D3((a0) this.receiver, i13);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f54660a) {
            case 0:
                h(((Number) obj).intValue());
                break;
            case 1:
                h(((Number) obj).intValue());
                break;
            case 2:
                h(((Number) obj).intValue());
                break;
            case 3:
                h(((Number) obj).intValue());
                break;
            case 4:
                h(((Number) obj).intValue());
                break;
            default:
                h(((Number) obj).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
