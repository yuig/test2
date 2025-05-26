package yg2;

import com.squareup.moshi.internal.Util$ParameterizedTypeImpl;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.y0;
import org.jetbrains.annotations.NotNull;
import pg2.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'CRASH' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f ATTACHMENT;
    public static final f BLOB;
    public static final f CRASH;

    @NotNull
    public static final e Companion;
    public static final f LOG;
    public static final f SESSION;

    @NotNull
    private static final Map<String, f> valueMap;

    @NotNull
    private final s endpoint;

    @NotNull
    private final String priority;
    private final Type serializedType;

    private static final /* synthetic */ f[] $values() {
        return new f[]{CRASH, SESSION, ATTACHMENT, LOG, BLOB};
    }

    static {
        Util$ParameterizedTypeImpl util$ParameterizedTypeImpl = Envelope.f73107g;
        s sVar = s.LOGS;
        CRASH = new f("CRASH", 0, util$ParameterizedTypeImpl, "p1", sVar);
        SESSION = new f("SESSION", 1, Envelope.f73106f, "p3", s.SESSIONS);
        ATTACHMENT = new f("ATTACHMENT", 2, null, "p4", s.ATTACHMENTS);
        LOG = new f("LOG", 3, util$ParameterizedTypeImpl, "p5", sVar);
        BLOB = new f("BLOB", 4, util$ParameterizedTypeImpl, "p7", sVar);
        $VALUES = $values();
        Companion = new e();
        f[] values = values();
        int a13 = y0.a(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13 < 16 ? 16 : a13);
        for (f fVar : values) {
            linkedHashMap.put(fVar.priority, fVar);
        }
        valueMap = linkedHashMap;
    }

    private f(String str, int i13, Type type, String str2, s sVar) {
        this.serializedType = type;
        this.priority = str2;
        this.endpoint = sVar;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    @NotNull
    public final s getEndpoint() {
        return this.endpoint;
    }

    @NotNull
    public final String getPriority() {
        return this.priority;
    }

    public final Type getSerializedType() {
        return this.serializedType;
    }
}
