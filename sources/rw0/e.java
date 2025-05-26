package rw0;

import df.j1;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final f f110110a;

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f110111b;

    static {
        f fVar = new f();
        fVar.f110114a = null;
        f110110a = fVar;
        f110111b = Pattern.compile(j1.V("(.+(\\.(?i)(%s))$)", "jpg|jpeg|png"));
    }
}
