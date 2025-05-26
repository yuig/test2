package hj2;

/* loaded from: classes4.dex */
public enum b {
    INSTANCE;

    public String multiLineDebugString() {
        int i13 = a.f69284a;
        return "\tat unknown source\n\t\tTo enable better debugging, run your JVM with -Dotel.experimental.sdk.metrics.debug=true";
    }

    public String shortDebugString() {
        return "unknown source";
    }
}
