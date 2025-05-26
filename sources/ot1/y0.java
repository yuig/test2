package ot1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public class y0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ y0[] $VALUES;

    @NotNull
    public static final p0 Companion;
    private final boolean isB;
    private final boolean isI;
    private final boolean isP;
    private final boolean isSi;
    private final boolean isSp;
    public static final y0 P = new y0() { // from class: ot1.s0

        /* renamed from: a, reason: collision with root package name */
        public final boolean f97614a = true;

        @Override // ot1.y0
        public final boolean isP() {
            return this.f97614a;
        }
    };
    public static final y0 B = new y0() { // from class: ot1.n0

        /* renamed from: a, reason: collision with root package name */
        public final boolean f97610a = true;

        @Override // ot1.y0
        public final boolean isB() {
            return this.f97610a;
        }
    };
    public static final y0 I = new y0() { // from class: ot1.q0

        /* renamed from: a, reason: collision with root package name */
        public final boolean f97612a = true;

        @Override // ot1.y0
        public final boolean isI() {
            return this.f97612a;
        }
    };
    public static final y0 Sp = new y0() { // from class: ot1.w0

        /* renamed from: a, reason: collision with root package name */
        public final boolean f97640a = true;

        @Override // ot1.y0
        public final boolean isSp() {
            return this.f97640a;
        }
    };
    public static final y0 Si = new y0() { // from class: ot1.u0

        /* renamed from: a, reason: collision with root package name */
        public final boolean f97617a = true;

        @Override // ot1.y0
        public final boolean isSi() {
            return this.f97617a;
        }
    };
    public static final y0 POnly = new y0() { // from class: ot1.t0

        /* renamed from: a, reason: collision with root package name */
        public final boolean f97615a = true;

        @Override // ot1.y0
        public final boolean isP() {
            return this.f97615a;
        }
    };
    public static final y0 BOnly = new y0() { // from class: ot1.o0

        /* renamed from: a, reason: collision with root package name */
        public final boolean f97611a = true;

        @Override // ot1.y0
        public final boolean isB() {
            return this.f97611a;
        }
    };
    public static final y0 IOnly = new y0() { // from class: ot1.r0

        /* renamed from: a, reason: collision with root package name */
        public final boolean f97613a = true;

        @Override // ot1.y0
        public final boolean isI() {
            return this.f97613a;
        }
    };
    public static final y0 SpOnly = new y0() { // from class: ot1.x0

        /* renamed from: a, reason: collision with root package name */
        public final boolean f97644a = true;

        @Override // ot1.y0
        public final boolean isSp() {
            return this.f97644a;
        }
    };
    public static final y0 SiOnly = new y0() { // from class: ot1.v0

        /* renamed from: a, reason: collision with root package name */
        public final boolean f97636a = true;

        @Override // ot1.y0
        public final boolean isSi() {
            return this.f97636a;
        }
    };

    private static final /* synthetic */ y0[] $values() {
        return new y0[]{P, B, I, Sp, Si, POnly, BOnly, IOnly, SpOnly, SiOnly};
    }

    static {
        y0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new p0();
    }

    public /* synthetic */ y0(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static y0 valueOf(String str) {
        return (y0) Enum.valueOf(y0.class, str);
    }

    public static y0[] values() {
        return (y0[]) $VALUES.clone();
    }

    public boolean isB() {
        return this.isB;
    }

    public boolean isI() {
        return this.isI;
    }

    public boolean isP() {
        return this.isP;
    }

    public boolean isSi() {
        return this.isSi;
    }

    public boolean isSp() {
        return this.isSp;
    }

    private y0(String str, int i13) {
    }
}
