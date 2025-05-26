package df;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum i {
    Login(0),
    Share(1),
    Message(2),
    Like(3),
    GameRequest(4),
    AppGroupCreate(5),
    AppGroupJoin(6),
    AppInvite(7),
    DeviceShare(8),
    GamingFriendFinder(9),
    GamingGroupIntegration(10),
    Referral(11),
    GamingContextCreate(12),
    GamingContextSwitch(13),
    GamingContextChoose(14),
    TournamentShareDialog(15);

    private final int offset;

    i(int i13) {
        this.offset = i13;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static i[] valuesCustom() {
        i[] valuesCustom = values();
        return (i[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final int toRequestCode() {
        le.v vVar = le.v.f83104a;
        k1.f();
        return le.v.f83113j + this.offset;
    }
}
