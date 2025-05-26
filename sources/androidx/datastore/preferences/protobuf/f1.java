package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final e1 f18064a;

    /* renamed from: b, reason: collision with root package name */
    public static final e1 f18065b;

    static {
        e1 e1Var;
        try {
            e1Var = (e1) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            e1Var = null;
        }
        f18064a = e1Var;
        f18065b = new e1();
    }
}
