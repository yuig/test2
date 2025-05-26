package pk;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class n2 extends d7.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Comparator f100457c;

    public n2(s2 s2Var) {
        this.f100457c = s2Var;
    }

    @Override // d7.b
    public final Map w() {
        return new TreeMap(this.f100457c);
    }
}
