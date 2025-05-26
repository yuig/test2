package pf;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum c {
    SEND,
    ASKFOR,
    TURN,
    INVITE;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static c[] valuesCustom() {
        c[] valuesCustom = values();
        return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
