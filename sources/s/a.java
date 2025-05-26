package s;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f110242a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f110243b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f110244c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f110245d;

    public final u0.i a() {
        String str = this.f110242a == null ? " audioSource" : "";
        if (this.f110243b == null) {
            str = str.concat(" sampleRate");
        }
        if (this.f110244c == null) {
            str = a.a.C(str, " channelCount");
        }
        if (this.f110245d == null) {
            str = a.a.C(str, " audioFormat");
        }
        if (!str.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        int intValue = this.f110242a.intValue();
        int intValue2 = this.f110243b.intValue();
        int intValue3 = this.f110244c.intValue();
        int intValue4 = this.f110245d.intValue();
        u0.i iVar = new u0.i(intValue, intValue2, intValue3, intValue4);
        String str2 = intValue == -1 ? " audioSource" : "";
        if (intValue2 <= 0) {
            str2 = str2.concat(" sampleRate");
        }
        if (intValue3 <= 0) {
            str2 = a.a.C(str2, " channelCount");
        }
        if (intValue4 == -1) {
            str2 = a.a.C(str2, " audioFormat");
        }
        if (str2.isEmpty()) {
            return iVar;
        }
        throw new IllegalArgumentException("Required settings missing or non-positive:".concat(str2));
    }
}
