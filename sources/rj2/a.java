package rj2;

import java.util.List;
import ui2.n;

/* loaded from: classes4.dex */
public enum a implements e {
    INSTANCE;

    @Override // rj2.e
    public String getDescription() {
        return "AlwaysOffSampler";
    }

    @Override // rj2.e
    public g shouldSample(vi2.b bVar, String str, String str2, n nVar, qi2.d dVar, List<Object> list) {
        return c.f108426d;
    }

    @Override // java.lang.Enum
    public String toString() {
        return getDescription();
    }
}
