import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int counter = 0;
    public static StringBuilder gallow = new StringBuilder("""
                                                            _____
                                                              |
                                                            """);
    public static void main(String[] args) {
        String[] words = {"prepare", "spoke", "numerous", "fifty", "shooting", "pollution", "youth", "without",
                "these", "approved", "would", "outcomes", "ten", "audience", "solid", "thus",
                "neutral", "require", "scratch", "circular", "optional", "baker", "analysis", "click",
                "apparent", "exposure", "reserved", "wing", "wine", "wind", "chapter", "entitled",
                "ahead", "anybody", "infinite", "yellow", "balanced", "example", "after", "quiet",
                "headline", "connect", "rational", "address", "artistic", "union", "blood", "neighbor",
                "entering", "suite", "throw", "exciting", "fifth", "thank", "obvious", "combined",
                "yours", "imperial", "novel", "discuss", "liberal", "surgery", "standard", "violent",
                "correct", "resolve", "sworn", "empty", "wish", "wise", "serious", "laugh",
                "fantasy", "fashions", "check", "enormous", "strange", "wire", "external", "spending",
                "aside", "success", "supposed", "child", "young", "regional", "divided", "provided",
                "society", "arranged", "recycled", "provider", "romantic", "motivate", "pilot", "caliber",
                "approval", "victory", "perform", "multiple", "with", "china", "service", "there",
                "handling", "suitable", "outlook", "channel", "focus", "american", "changing", "approach",
                "crowning", "block", "write", "order", "fiber", "period", "proceed", "distant",
                "loyalty", "birth", "dismiss", "bringing", "install", "strongly", "crazy", "coach",
                "women", "hundred", "woman", "circuit", "queen", "instant", "upscale", "syndrome",
                "noise", "violence", "dominant", "question", "heading", "premier", "cheap", "produce",
                "picture", "disable", "thousand", "tonight", "capital", "minor", "arrow", "prevents",
                "employee", "abilities", "biggest", "judgment", "charity", "whether", "academic", "function",
                "raise", "west", "quite", "mineral", "stock", "tower", "traffic", "everyone",
                "basis", "affected", "senator", "snow", "improve", "mounting", "ceremony", "governor",
                "twist", "chicken", "fruit", "policies", "cause", "unity", "teacher", "intended",
                "extra", "generous", "working", "floor", "chief", "bachelor", "aircraft", "automatic",
                "despite", "opening", "burning", "conduct", "machines", "respond", "sport", "formerly",
                "incident", "japan", "concern", "notation", "coaching", "state", "adviser", "press",
                "welcome", "meeting", "undue", "element", "chaos", "began", "night", "forecast",
                "input", "offering", "reality", "monitors", "probably", "document", "aluminum", "networks",
                "chase", "prize", "two", "accident", "promote", "found", "routine", "reported",
                "divorce", "kitchen", "funny", "emerging", "think", "receive", "surplus", "occurred",
                "replaced", "intimate", "team", "services", "theft", "entirely", "religion", "standing",
                "charm", "watch", "chart", "thing", "cabinet", "feelings", "optical", "fashion",
                "demanded", "medical", "smith", "align", "anymore", "domestic", "dying", "holidays",
                "continue", "shoot", "acquired", "realize", "brush", "given", "chest", "glass",
                "eastern", "marathon", "firearms", "doubt", "develop", "measure", "involved", "district",
                "overall", "fixed", "receipt", "basement", "concept", "video", "settling", "house",
                "wave", "anything", "minimal", "retired", "early", "enclose", "enhance", "disease",
                "writings", "rotation", "start", "purchase", "equal", "alike", "typical", "short",
                "time", "finance", "gateway", "parking", "measured", "regulate", "happy", "program",
                "three", "required", "climb", "payment", "enter", "gallery", "hardware", "sessions",
                "threw", "destroy", "heritage", "priority", "creative", "coast", "provide", "light",
                "tiny", "valuable", "primary", "teaching", "alien", "layer", "smart", "triangle",
                "unknown", "elite", "computer", "ways", "premium", "theme", "consult", "grown",
                "meant", "wealth", "chain", "funding", "survive", "initial", "touching", "chair",
                "reverse", "earnings", "firewall", "hanging", "randomly", "diabetes", "facility", "small",
                "quick", "alliance", "fiction", "tell", "replace", "husband", "launched", "bloom",
                "major", "shown", "emphasis", "feasible", "pointing", "consider", "group", "drinking",
                "gross", "island", "workshop", "history", "water", "illegal", "twice", "managing",
                "sustain", "belonged", "request", "grinding", "their", "point", "thirteen", "debut",
                "general", "sixteen", "specimen", "dated", "hospital", "ceiling", "process", "restore",
                "built", "therapy", "clear", "heavily", "clean", "third", "someone", "build",
                "approve", "neither", "further", "account", "innocent", "advance", "trip", "depending",
                "diverse", "reflects", "prime", "going", "festival", "foothill", "nineteen", "shock",
                "profile", "court", "whose", "venture", "buyer", "route", "flexible", "mentions",
                "dealt", "adult", "relative", "average", "compare", "choosing", "interior", "adoption",
                "peter", "grass", "integral", "assembly", "hotel", "hearing", "term", "wedding",
                "rigid", "spare", "business", "subjects", "medieval", "staff", "right", "involve",
                "possible", "march", "stage", "maximum", "restored", "under", "quarter", "compete",
                "listener", "promise", "faculty", "trail", "later", "prior", "legal", "trait",
                "reply", "highway", "landmark", "train", "commonly", "count", "brown", "publicly",
                "month", "blame", "final", "carrying", "occasion", "virtual", "blank", "waiting",
                "session", "endless", "training", "title", "duration", "pound", "company", "maria",
                "nuclear", "human", "owner", "midnight", "billions", "spelling", "relax", "monitor",
                "grand", "strictly", "henry", "existing", "print", "although", "material", "owned",
                "beach", "grant", "showing", "upcoming", "explain", "lunch", "brothers", "helping",
                "discount", "convert", "attempt", "tracking", "thick", "division", "balance", "supplies",
                "revealed", "highland", "pitch", "text", "whereas", "lying", "printer", "cream",
                "sense", "being", "protest", "loading", "heavy", "field", "interval", "evaluate",
                "upset", "curve", "deliver", "eight", "mention", "products", "known", "laundry",
                "nurse", "crime", "stand", "together", "could", "forward", "amber", "gathered",
                "Pacific", "machine", "evening", "instance", "subject", "nursing", "serve", "radio",
                "smile", "confused", "revenue", "strip", "solution", "selected", "terrible", "alter",
                "combine", "waste", "citizen", "textbook", "ideal", "workflow", "drove", "occur",
                "pressure", "heart", "friends", "lists", "present", "oriented", "colorful", "since",
                "veterans", "troubles", "smoking", "troubled", "genuine", "physical", "falling", "equation",
                "stern", "exactly", "compound", "stake", "evident", "depend", "sized", "about",
                "danger", "crash", "cover", "reflect", "ongoing", "meaning", "above", "drawing",
                "magnetic", "stick", "moderate", "resident", "symbolic", "outer", "received", "execute",
                "benefit", "booth", "quality", "filename", "thereby", "boost", "programs", "shelter",
                "examine", "industry", "believe", "remember", "outline", "teaming", "supports", "examined",
                "equality", "ought", "reaction", "actually", "abandon", "inspire", "bulletin", "ratio",
                "agent", "woodland", "rapid", "seven", "project", "arena", "whenever", "diameter",
                "studying", "dropping", "finding", "sections", "campaign", "vital", "internet", "allow",
                "rough", "lawsuit", "commerce", "speed", "auction", "apple", "admit", "interest",
                "surfaces", "every", "twin", "organic", "summary", "winning", "answered", "apply",
                "again", "dramatic", "bedroom", "landing", "money", "disagree", "healthy", "removal",
                "formula", "comment", "forever", "trend", "binding", "whole", "during", "consist",
                "relation", "reliable", "price", "still", "arise", "linking", "agree", "focusing",
                "knowing", "spectrum", "versions", "among", "anyone", "pride", "emperor", "steel",
                "internal", "steep", "thumb", "isolated", "enjoy", "pictures", "foreign", "throwing",
                "uniform", "mortgage", "identity", "writing", "federal", "steer", "believed", "event",
                "explains", "academy", "undergo", "outlying", "wherever", "include", "railroad", "abstract",
                "opinion", "soldier", "cutting", "first", "voice", "perfect", "prefer", "roman",
                "craft", "minority", "tight", "space", "chamber", "arrange", "depart", "discover",
                "bench", "capture", "finished", "revision", "fixture", "death", "frequent", "deployed",
                "error", "platform", "network", "paper", "array", "walking", "spend", "steam",
                "track", "value", "repay", "fortune", "grave", "spent", "charging", "instead",
                "command", "trade", "round", "siblings", "habitat", "bicycle", "year", "leading",
                "accuracy", "building", "setting", "score", "music", "graduate", "because", "unlikely",
                "upgrade", "mayor", "merchant", "economy", "inspired", "lighting", "version", "cultural",
                "contains", "guess", "science", "guest", "shortly", "southern", "essence", "least",
                "utility", "sleep", "rolling", "swimming", "particle", "behavior", "close", "website",
                "density", "learn", "photo", "pushing", "weird", "swing", "lease", "routines",
                "sweet", "register", "fleet", "controls", "eager", "evidence", "republic", "moved",
                "rural", "official", "leave", "fitness", "swift", "minister", "wrote", "often",
                "consent", "encoding", "article", "respect", "shelf", "shell", "loose", "exchange",
                "lasting", "trust", "income", "private", "billy", "soldiers", "peaceful", "prevent",
                "overnight", "stretch", "laser", "sorry", "mixture", "scope", "legalize", "satellite",
                "forty", "mistake", "label", "message", "recorded", "forum", "noted", "special",
                "horizon", "truth", "achieved", "detected", "referred", "college", "shoulders", "tries",
                "wanting", "movie", "release", "moral", "newly", "number", "tried", "decline",
                "property", "brave", "judge", "similar", "shape", "nothing", "forth", "tough",
                "crossing", "partial", "weapons", "other", "uncle", "holiday", "local", "courage",
                "crude", "segments", "valid", "defeat", "share", "speak", "deficit", "chairman",
                "sharp", "powerful", "logic", "royal", "movement", "kilowatt", "trial", "updating",
                "modified", "links", "cable", "closure", "qualify", "intense", "pregnant", "catching",
                "upgrading", "below", "shall", "touch", "brass", "clock", "expense", "driving",
                "tribe", "collect", "badly", "boundary", "mandate", "equipped", "elderly", "reaching",
                "media", "trick", "running", "today", "chose", "predict", "fifteen", "frontier",
                "coating", "radical", "lewis", "adjacent", "specific", "super", "until", "collapse",
                "reversed", "thought", "accurate", "maintain", "shift", "taste", "anywhere", "decided",
                "maximize", "poverty", "dance", "fully", "shopping", "using", "broke", "imminent",
                "expected", "sampling", "mount", "himself", "envelope", "mystery", "grade", "deposit",
                "flash", "annually", "mobility", "maybe", "housing", "frequently", "another", "students",
                "enemy", "acquire", "worth", "literal", "matching", "default", "taken", "grace",
                "dividend", "where", "disabled", "popular", "genetic", "silly", "black", "classic",
                "partners", "absolute", "describe", "through", "resulted", "becoming", "strength", "sterling",
                "remains", "repeated", "research", "debate", "sciences", "mouse", "mother", "features",
                "protests", "white", "segment", "those", "worry", "imagine", "might", "worse",
                "whatever", "decrease", "worst", "selling", "clothing", "blind", "distance", "absence",
                "truck", "attract", "edition", "situated", "negative", "central", "defend", "hence",
                "lived", "delivery", "thoughts", "green", "learned", "suddenly", "momentum", "mouth",
                "what", "urban", "refer", "detailed", "guidance", "rebel", "modeling", "usage",
                "taxes", "when", "piano", "anxious", "largely", "stuck", "broad", "catch",
                "truly", "elevate", "greater", "double", "downtown", "stations", "trunk", "limiting",
                "phone", "slide", "style", "jimmy", "study", "guard", "harry", "portion",
                "pattern", "exercise", "enabled", "vehicle", "freedom", "memories", "civilize", "protect",
                "explore", "display", "sided", "climate", "great", "meanings", "happened", "wrong",
                "disorder", "shirt", "certain", "board", "economic", "stuff", "wondered", "section",
                "used", "cloud", "totally", "package", "visible", "handicap", "perfects", "inner",
                "produced", "veteran", "outside", "daily", "topic", "sugar", "daughter", "acute",
                "politics", "faith", "captain", "alone", "database", "along", "parallel", "patient",
                "dialogue", "sheet", "original", "album", "electric", "sandwich", "designer", "terminal",
                "increase", "kingdom", "shine", "educated", "gigabit", "various", "front", "visit",
                "user", "treating", "customer", "plane", "projects", "greeting", "bring", "stripped",
                "awake", "offer", "colonial", "draft", "complex", "giant", "pension", "fluid",
                "addition", "excited", "personal", "angry", "symptoms", "plastic", "delay", "globe",
                "chemical", "turning", "peace", "plant", "enquiry", "looking", "drive", "brother",
                "greatly", "jones", "frank", "abuse", "prove", "virus", "sixth", "isolate",
                "civil", "national", "indicate", "panel", "compared", "sixty", "enabling", "contain",
                "keeping", "founder", "medicine", "familiar", "actor", "tropical", "awesome", "partner",
                "somewhat", "vicinity", "river", "language", "graphics", "nearest", "resumes", "observe",
                "shipping", "contact", "warning", "exclude", "needs", "which", "image", "patterns",
                "mainland", "fourteen", "never", "anxiety", "piece", "carry", "western", "party",
                "frame", "lucky", "however", "visiting", "vocal", "capable", "content", "getting",
                "desktop", "perhaps", "related", "alert", "skill", "captured", "trouble", "class",
                "contrary", "digital", "attended", "historic", "bound", "false", "counter", "football",
                "breed", "publish", "realm", "avoid", "fresh", "homepage", "decade", "practice",
                "corridor", "fulfill", "crowd", "advanced", "congress", "welfare", "context", "warranty",
                "model", "majority", "bathroom", "crown", "sentence", "advisory", "issue", "large",
                "surface", "director", "lower", "metal", "index", "ordinary", "drink", "announce",
                "operate", "contrast", "begin", "annoying", "breeding", "template", "brought", "alive",
                "crystal", "payments", "plate", "cycle", "thinking", "disposal", "world", "library",
                "composed", "inquiry", "angle", "hopefully", "ability", "table", "resisted", "bread",
                "break", "comfort", "clearing", "likewise", "century", "complete", "married", "constant",
                "several", "while", "northern", "anger", "roger", "suggests", "split", "limit",
                "claim", "directly", "contest", "level", "feeling", "preserve", "flowing", "relevant",
                "entry", "license", "dream", "attached", "parents", "birthday", "student", "careful",
                "ideology", "mixed", "storage", "total", "reserve", "somehow", "fight", "consumer",
                "brief", "keyboard", "recover", "wheel", "cross", "homeless", "control", "drill",
                "cousin", "receptor", "painting", "earth", "spiritual", "truthful", "sitting", "dancing",
                "readily", "coherent", "upper", "paint", "stood", "dwelling", "episode", "promised",
                "scene", "objective", "dynamics", "speaking", "province", "estimate", "hundreds", "exhibit",
                "brand", "breaking", "proposal", "diseases", "portable", "ancient", "morning", "horse",
                "mission", "adopt", "stopping", "attorney", "obtained", "device", "minus", "motor",
                "activity", "current", "democrat", "variety", "lecture", "persist", "civilian", "apart",
                "teenager", "calendar", "storm", "manager", "decision", "maker", "amid", "store",
                "confirm", "dealer", "story", "country", "joint", "willing", "available", "express",
                "advocate", "enclosed", "dynamic", "military", "written", "passion", "extreme", "usual",
                "organism", "athlete", "suppose", "ocean", "failure", "solve", "support", "drop",
                "doing", "privacy", "vehicles", "learning", "vertical", "summoned", "missing", "coverage",
                "wide", "previous", "teach", "reading", "argue", "stone", "succeed", "location",
                "software", "reach", "gigabyte", "type", "feedback", "problem", "children", "justify",
                "sight", "weather", "teeth", "proof", "presence", "guide", "between", "phase",
                "natural", "drank", "wife", "overhead", "contract", "leather", "exist", "insight",
                "readings", "seventeen", "exact", "force", "surrounded", "south", "seasonal", "north",
                "freight", "range", "weak", "capacity", "feature", "labeling", "course", "telecom",
                "place", "power", "precise", "regular", "dispute", "suggest", "suspect", "brain",
                "token", "depth", "emotion", "massive", "asset", "minimum", "magic", "dress",
                "argument", "passage", "adequate", "sound", "dozen", "growing", "deciding", "plain",
                "justice", "climbing", "obesity", "notebook", "proud", "curious", "resource", "profiles",
                "accepted", "towards", "interim", "fraud", "council", "purposes", "enforce", "herself",
                "purpose", "rejected", "penalty", "snake", "scale", "distinct", "recovery", "aware",
                "robin", "engaging", "drama", "award", "organize", "ready", "eligible", "floating",
                "marriage", "alarm", "station", "village", "greatest", "factory", "will", "limited",
                "satisfy", "fishing", "match", "smoke", "fault", "revenues", "clothes", "carrier",
                "response", "informal", "category", "rival", "wild"
        };
        Scanner scan = new Scanner(System.in);
        int number = 0;
        String randomWord = words[(int) (Math.random() * words.length)];
        StringBuilder wordGuess = new StringBuilder();
        wordGuess.append(randomWord.charAt(0));
        for(int i = 1; i < randomWord.length() - 1; i ++) {
            if(randomWord.charAt(i) == randomWord.charAt(0) || randomWord.charAt(i) == randomWord.charAt(randomWord.length() - 1)) {
                wordGuess.append(randomWord.charAt(i));
            } else {
                wordGuess.append("_");
            }
        }
        wordGuess.append(randomWord.charAt(randomWord.length() - 1));
        System.out.println(wordGuess);
        char[] guessArray = new char[wordGuess.length()];
        wordGuess.getChars(0, wordGuess.length(), guessArray, 0);
        while(!wordGuess.toString().equals(randomWord)) {
            System.out.print("Enter a letter: ");
            char letter = scan.next().charAt(0);
            if (randomWord.contains(String.valueOf(letter))) {
                System.out.println("You guessed a letter.");
                number ++;
                for (int i = 1; i <= randomWord.length() - 2; i++) {
                    if (randomWord.charAt(i) == letter) {
                        guessArray[i] = letter;
                        wordGuess = new StringBuilder(new String(guessArray));
                        System.out.println(wordGuess);
                    } else if (wordGuess.toString().equals(randomWord)) {
                        break;
                    }
                }
            } else {
                printHangman();
                counter ++;
                if(counter == 8) {
                    break;
                }
            }
        }
        System.out.println("You guessed the word!");
    }

    public static void printHangman() {
        switch (counter) {
            case 0:
                System.out.println(gallow);
                break;
            case 1:
                gallow.append("  o\n");
                System.out.println(gallow);
                break;
            case 2:
                gallow.append(" /");
                System.out.println(gallow);
                break;
            case 3:
                gallow.append("|");
                System.out.println(gallow);
                break;
            case 4:
                gallow.append("\\\n");
                System.out.println(gallow);
                break;
            case 5:
                gallow.append("  |\n");
                System.out.println(gallow);
                break;
            case 6:
                gallow.append(" /");
                System.out.println(gallow);
                break;
            case 7:
                gallow.append(" \\\n");
                System.out.println(gallow);
            default:
                System.out.println("You lost hangman");
                break;
        }
    }
}