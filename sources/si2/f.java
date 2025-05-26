package si2;

/* loaded from: classes4.dex */
public interface f {
    e a(String str);

    default d get() {
        return a("noop").build();
    }
}
