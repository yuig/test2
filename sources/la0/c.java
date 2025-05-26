package la0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final c f82375a = new c();

    @Override // x31.a
    public final x31.r a() {
        return f.CreatedByYou;
    }

    @Override // la0.e
    public final xa0.l b() {
        return xa0.l.PUBLISHED;
    }

    @Override // x31.a
    public final u50.k0 d() {
        int i13 = ka0.b0.collages_retrieval_filter_created_by_you;
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return new u50.k0(i13, new ArrayList(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1888840355;
    }

    public final String toString() {
        return "CreatedByYou";
    }
}
