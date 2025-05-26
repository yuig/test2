package com.modiface.mfemakeupkit.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/modiface/mfemakeupkit/utils/a;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "version", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "c", "d", "e", "mfemakeupkit_retailerRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes7.dex */
public enum a {
    v33("v3.3"),
    v35("v3.5"),
    v36("v3.6");


    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String version;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/modiface/mfemakeupkit/utils/a$a;", "", "", "version", "Lcom/modiface/mfemakeupkit/utils/a;", "a", "<init>", "()V", "mfemakeupkit_retailerRelease"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.modiface.mfemakeupkit.utils.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final a a(@NotNull String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            switch (version.hashCode()) {
                case 3565826:
                    if (version.equals("v3.3")) {
                        return a.v33;
                    }
                    return null;
                case 3565827:
                default:
                    return null;
                case 3565828:
                    if (version.equals("v3.5")) {
                        return a.v35;
                    }
                    return null;
                case 3565829:
                    if (version.equals("v3.6")) {
                        return a.v36;
                    }
                    return null;
            }
        }

        private Companion() {
        }
    }

    a(String str) {
        this.version = str;
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final String getVersion() {
        return this.version;
    }
}
