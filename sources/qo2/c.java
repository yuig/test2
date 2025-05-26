package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f104535c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(oo2.g elementDesc, int i13) {
        super(elementDesc);
        this.f104535c = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
            super(elementDesc);
        } else if (i13 != 2) {
            Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
        } else {
            Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
            super(elementDesc);
        }
    }

    @Override // oo2.g
    public final String i() {
        switch (this.f104535c) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
