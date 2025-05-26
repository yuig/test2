package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum ln implements a.w {
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED(0),
    /* JADX INFO: Fake field, exist only in values array */
    UNIT_TEST(1),
    /* JADX INFO: Fake field, exist only in values array */
    ADSENSE(2),
    /* JADX INFO: Fake field, exist only in values array */
    GPT_IMPL_MAIN(3),
    /* JADX INFO: Fake field, exist only in values array */
    GPT_PROD_IMPL_CONTEXT(4),
    /* JADX INFO: Fake field, exist only in values array */
    PROD_GPT_ERROR_REPORTING_CONTEXT(5),
    /* JADX INFO: Fake field, exist only in values array */
    GENOTYPE_OBSERVER(6),
    /* JADX INFO: Fake field, exist only in values array */
    CLIENT_AGE(7),
    /* JADX INFO: Fake field, exist only in values array */
    GENERATE_BID_WIN(8),
    /* JADX INFO: Fake field, exist only in values array */
    GENERATE_BID_LOSS(9),
    /* JADX INFO: Fake field, exist only in values array */
    SCORE_ADS(10),
    /* JADX INFO: Fake field, exist only in values array */
    GPT_LOADER(11),
    /* JADX INFO: Fake field, exist only in values array */
    GPT_LOADER_FOR_NON_GPT_TESTS(18),
    /* JADX INFO: Fake field, exist only in values array */
    GMA_SDK(12),
    /* JADX INFO: Fake field, exist only in values array */
    HYPERACTIVE_BUCKET(13),
    /* JADX INFO: Fake field, exist only in values array */
    HYPERACTIVE_BUCKET(14),
    ADSHIELD(15),
    /* JADX INFO: Fake field, exist only in values array */
    HYPERACTIVE_BUCKET(16),
    /* JADX INFO: Fake field, exist only in values array */
    HYPERACTIVE_BUCKET(17),
    /* JADX INFO: Fake field, exist only in values array */
    HYPERACTIVE_BUCKET(19),
    /* JADX INFO: Fake field, exist only in values array */
    HYPERACTIVE_BUCKET(20),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f7893a;

    ln(int i13) {
        this.f7893a = i13;
    }

    @Override // a.w
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f7893a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("<");
        sb3.append(ln.class.getName());
        sb3.append('@');
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb3.append(" number=");
            sb3.append(a());
        }
        sb3.append(" name=");
        sb3.append(name());
        sb3.append('>');
        return sb3.toString();
    }
}
