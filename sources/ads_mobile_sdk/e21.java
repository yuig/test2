package ads_mobile_sdk;

import java.io.IOException;

/* loaded from: classes2.dex */
public class e21 extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4580b = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f4581a;

    public e21(d21 d21Var) {
        super("Unable to parse map entry.", d21Var);
    }

    public static e21 a() {
        return new e21("Protocol message had invalid UTF-8.");
    }

    public static e21 b() {
        return new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static e21 c() {
        return new e21("Failed to parse the message.");
    }

    public static e21 d() {
        return new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public e21(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public e21(String str) {
        super(str);
    }
}
