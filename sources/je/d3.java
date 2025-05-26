package je;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public enum d3 {
    svg,
    a,
    circle,
    clipPath,
    defs,
    desc,
    ellipse,
    g,
    image,
    line,
    linearGradient,
    marker,
    mask,
    path,
    pattern,
    polygon,
    polyline,
    radialGradient,
    rect,
    solidColor,
    stop,
    style,
    SWITCH,
    symbol,
    text,
    textPath,
    title,
    tref,
    tspan,
    use,
    view,
    UNSUPPORTED;

    private static final Map<String, d3> cache = new HashMap();

    static {
        for (d3 d3Var : values()) {
            if (d3Var == SWITCH) {
                cache.put("switch", d3Var);
            } else if (d3Var != UNSUPPORTED) {
                cache.put(d3Var.name(), d3Var);
            }
        }
    }

    public static d3 fromString(String str) {
        d3 d3Var = cache.get(str);
        return d3Var != null ? d3Var : UNSUPPORTED;
    }
}
