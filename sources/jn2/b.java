package jn2;

import kotlin.jvm.internal.Intrinsics;
import pn2.b0;

/* loaded from: classes4.dex */
public final class b extends a implements e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f77124b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final ym2.g f77125c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f77126d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(am2.b declarationDescriptor, b0 receiverType, ym2.g gVar) {
        super(receiverType);
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        Intrinsics.checkNotNullParameter(receiverType, "receiverType");
        this.f77126d = declarationDescriptor;
        this.f77125c = gVar;
    }

    public final String toString() {
        Object obj = this.f77126d;
        switch (this.f77124b) {
            case 0:
                return getType() + ": Ctx { " + ((am2.g) obj) + " }";
            default:
                return "Cxt { " + ((am2.b) obj) + " }";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(am2.g classDescriptor, b0 receiverType, ym2.g gVar) {
        super(receiverType);
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(receiverType, "receiverType");
        this.f77126d = classDescriptor;
        this.f77125c = gVar;
    }
}
