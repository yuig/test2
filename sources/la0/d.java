package la0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f82385a = new d();

    @Override // x31.a
    public final x31.r a() {
        return f.InProgress;
    }

    @Override // la0.e
    public final xa0.l b() {
        return xa0.l.DRAFTS;
    }

    @Override // x31.a
    public final u50.k0 d() {
        int i13 = ka0.b0.collages_retrieval_in_progress_tab;
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return new u50.k0(i13, new ArrayList(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -23660337;
    }

    public final String toString() {
        return "InProgress";
    }
}
