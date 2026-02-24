    private ArrayDeque<String> actions = new ArrayDeque<>();

    public void initializeActions() {
        // TODO: Add 4 actions
        actions.add("action 1");
        actions.add("action 2");
        actions.add("action 3");
        actions.add("action 4");
    }

    public void undoLastAction() {
        // TODO: Remove last action
        if (!actions.isEmpty()) {
            String last = actions.pollLast();
            System.out.println("Removed action :" +last);
        } else {
            System.out.println("list is empty");
        }
    }

    public void addRequestedTranscript() {
        // TODO: Add "Requested Transcript"
        actions.addLast("Requested Transcript");
    }

    public void showFirstAndLast() {
        // TODO: Print first and last action
        if (!actions.isEmpty()) {
            String first = actions.getFirst();
            String last = actions.getLast();
            System.out.println("first : " + first);
            System.out.println("last :" + last);
        } else {
            System.out.println("list is empty");
        }
    }

    public void printHistory() {
        // TODO: Iterate through history
        Iterator<String> iter = actions.iterator();
        System.out.println("--Full actions history---");
        while (iter.hasNext()) {
            System.out.println("--" +iter.next());
        }
    }
