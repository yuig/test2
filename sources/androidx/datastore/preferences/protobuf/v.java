package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final u f18151a = new u();

    /* renamed from: b, reason: collision with root package name */
    public static final u f18152b;

    static {
        u uVar;
        try {
            uVar = (u) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            uVar = null;
        }
        f18152b = uVar;
    }
}
