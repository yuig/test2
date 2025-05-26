package dg;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.Objects;
import java.util.function.Predicate;
import pk.a0;
import vi2.i;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54899a;

    public /* synthetic */ b(int i13) {
        this.f54899a = i13;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f54899a) {
            case 0:
                return Objects.nonNull(obj);
            case 1:
                return a0.s0((String) obj);
            default:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                int i13 = i.f125880d;
                throw null;
        }
    }
}
