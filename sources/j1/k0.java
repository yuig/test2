package j1;

/* loaded from: classes.dex */
public final class k0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f74129a;

    /* renamed from: b, reason: collision with root package name */
    public final n1 f74130b;

    public k0(float f13, float f14, float f15) {
        this.f74129a = f15;
        n1 n1Var = new n1();
        n1Var.f74160a = 1.0f;
        double sqrt = Math.sqrt(50.0d);
        n1Var.f74161b = sqrt;
        n1Var.f74166g = 1.0f;
        if (f13 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        n1Var.f74166g = f13;
        n1Var.f74162c = false;
        if (((float) (sqrt * sqrt)) <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        n1Var.f74161b = Math.sqrt(f14);
        n1Var.f74162c = false;
        this.f74130b = n1Var;
    }

    @Override // j1.i0
    public final float b(float f13, float f14, float f15) {
        return 0.0f;
    }

    @Override // j1.i0
    public final float c(long j13, float f13, float f14, float f15) {
        n1 n1Var = this.f74130b;
        n1Var.f74160a = f14;
        return kh2.g0.z(n1Var.a(j13 / 1000000, f13, f15));
    }

    @Override // j1.i0
    public final float d(long j13, float f13, float f14, float f15) {
        n1 n1Var = this.f74130b;
        n1Var.f74160a = f14;
        return kh2.g0.A(n1Var.a(j13 / 1000000, f13, f15));
    }

    @Override // j1.i0
    public final long e(float f13, float f14, float f15) {
        double d2;
        x xVar;
        x xVar2;
        x xVar3;
        boolean z13;
        boolean z14;
        double d13;
        double d14;
        long j13;
        double d15;
        double d16;
        double d17;
        long j14;
        n1 n1Var = this.f74130b;
        double d18 = n1Var.f74161b;
        float f16 = (float) (d18 * d18);
        float f17 = n1Var.f74166g;
        float f18 = this.f74129a;
        float f19 = (f13 - f14) / f18;
        float f23 = f15 / f18;
        if (f17 == 0.0f) {
            j14 = 9223372036854L;
        } else {
            double d19 = f16;
            double d23 = f17;
            double d24 = f23;
            double d25 = f19;
            double d26 = 1.0f;
            double sqrt = d23 * 2.0d * Math.sqrt(d19);
            double d27 = (sqrt * sqrt) - (d19 * 4.0d);
            double d28 = -sqrt;
            if (d27 < 0.0d) {
                d2 = d26;
                xVar = new x(0.0d, Math.sqrt(Math.abs(d27)));
            } else {
                d2 = d26;
                xVar = new x(Math.sqrt(d27), 0.0d);
            }
            xVar.f74303a = (xVar.f74303a + d28) * 0.5d;
            xVar.f74304b *= 0.5d;
            if (d27 < 0.0d) {
                xVar2 = xVar;
                xVar3 = new x(0.0d, Math.sqrt(Math.abs(d27)));
            } else {
                xVar2 = xVar;
                xVar3 = new x(Math.sqrt(d27), 0.0d);
            }
            double d29 = -1;
            double d33 = xVar3.f74303a * d29;
            double d34 = xVar3.f74304b * d29;
            xVar3.f74303a = (d33 + d28) * 0.5d;
            xVar3.f74304b = d34 * 0.5d;
            if (d25 == 0.0d && d24 == 0.0d) {
                j13 = 0;
            } else {
                if (d25 < 0.0d) {
                    d24 = -d24;
                }
                double abs = Math.abs(d25);
                int i13 = 0;
                if (d23 > 1.0d) {
                    double d35 = xVar2.f74303a;
                    double d36 = xVar3.f74303a;
                    double d37 = (d35 * abs) - d24;
                    double d38 = d35 - d36;
                    double d39 = d37 / d38;
                    double d43 = abs - d39;
                    d14 = Math.log(Math.abs(d2 / d43)) / d35;
                    double log = Math.log(Math.abs(d2 / d39)) / d36;
                    if (!((Double.isInfinite(d14) || Double.isNaN(d14)) ? false : true)) {
                        d14 = log;
                    } else if (!(!((Double.isInfinite(log) || Double.isNaN(log)) ? false : true))) {
                        d14 = Math.max(d14, log);
                    }
                    double d44 = d43 * d35;
                    double log2 = Math.log(d44 / ((-d39) * d36)) / (d36 - d35);
                    if (Double.isNaN(log2) || log2 <= 0.0d) {
                        d15 = -d2;
                    } else {
                        if (log2 > 0.0d) {
                            if ((-((Math.exp(log2 * d36) * d39) + (Math.exp(d35 * log2) * d43))) < d2) {
                                if (d39 <= 0.0d || d43 >= 0.0d) {
                                    d16 = d14;
                                    d17 = d2;
                                } else {
                                    d17 = d2;
                                    d16 = 0.0d;
                                }
                                d15 = -d17;
                                d14 = d16;
                            }
                        }
                        d15 = d2;
                        d14 = Math.log((-((d39 * d36) * d36)) / (d44 * d35)) / d38;
                    }
                    double d45 = d39 * d36;
                    if (Math.abs((Math.exp(d36 * d14) * d45) + (Math.exp(d35 * d14) * d44)) >= 1.0E-4d) {
                        double d46 = Double.MAX_VALUE;
                        for (double d47 = 0.001d; d46 > d47 && i13 < 100; d47 = 0.001d) {
                            i13++;
                            double d48 = d35 * d14;
                            double d49 = d36 * d14;
                            double exp = d14 - ((((Math.exp(d49) * d39) + (Math.exp(d48) * d43)) + d15) / ((Math.exp(d49) * d45) + (Math.exp(d48) * d44)));
                            d46 = Math.abs(d14 - exp);
                            d14 = exp;
                        }
                    }
                } else {
                    x xVar4 = xVar2;
                    double d53 = d2;
                    if (d23 < 1.0d) {
                        double d54 = xVar4.f74303a;
                        double d55 = (d24 - (d54 * abs)) / xVar4.f74304b;
                        d14 = Math.log(d53 / Math.sqrt((d55 * d55) + (abs * abs))) / d54;
                    } else {
                        double d56 = xVar4.f74303a;
                        double d57 = d56 * abs;
                        double d58 = d24 - d57;
                        double log3 = Math.log(Math.abs(d53 / abs)) / d56;
                        double log4 = Math.log(Math.abs(d53 / d58));
                        double d59 = log4;
                        for (int i14 = 0; i14 < 6; i14++) {
                            d59 = log4 - Math.log(Math.abs(d59 / d56));
                        }
                        double d63 = d59 / d56;
                        if (Double.isInfinite(log3) || Double.isNaN(log3)) {
                            z13 = false;
                            z14 = true;
                        } else {
                            z14 = true;
                            z13 = true;
                        }
                        if (!z13) {
                            log3 = d63;
                        } else if (!(!((Double.isInfinite(d63) || Double.isNaN(d63)) ? false : z14))) {
                            log3 = Math.max(log3, d63);
                        }
                        double d64 = (-(d57 + d58)) / (d56 * d58);
                        double d65 = d56 * d64;
                        double d66 = log3;
                        double exp2 = (Math.exp(d65) * d58 * d64) + (Math.exp(d65) * abs);
                        if (Double.isNaN(d64) || d64 <= 0.0d) {
                            d53 = -d53;
                            d13 = d66;
                        } else if (d64 <= 0.0d || (-exp2) >= d53) {
                            d13 = (-(2.0d / d56)) - (abs / d58);
                        } else {
                            d13 = (d58 >= 0.0d || abs <= 0.0d) ? d66 : 0.0d;
                            d53 = -d53;
                        }
                        double d67 = Double.MAX_VALUE;
                        for (double d68 = 0.001d; d67 > d68 && i13 < 100; d68 = 0.001d) {
                            i13++;
                            double d69 = d56 * d13;
                            double exp3 = d13 - (((Math.exp(d69) * ((d58 * d13) + abs)) + d53) / (Math.exp(d69) * (((d69 + 1) * d58) + d57)));
                            d67 = Math.abs(d13 - exp3);
                            d13 = exp3;
                        }
                        d14 = d13;
                    }
                }
                j13 = (long) (d14 * 1000.0d);
            }
            j14 = j13;
        }
        return j14 * 1000000;
    }
}
