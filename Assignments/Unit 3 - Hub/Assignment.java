public class Assignment {
    private String title;
    private String description;
    private int descriptionLength;

    public Assignment(String title, String description) {
        setTitle(title);
        setDescription(description);
    }

    public void setTitle(String title) {
        if (title == null) {
            throw new IllegalArgumentException("Title cannot be null");
        } else if (title.equals("")) {
            throw new IllegalArgumentException("Title cannot be empty");
        } else if (title.length() > 254) {
            throw new IllegalArgumentException("Title too long (max 254 characters)");
            // apparently this is the actual Canvas character limit for titles
        }
        this.title = title;
    }

    public void setDescription(String description) {
        if (description == null) {
            throw new IllegalArgumentException("Description cannot be null");
        } else if (description.equals("")) {
            throw new IllegalArgumentException("Description cannot be empty");
        } else if (description.length() > 8192) {
            throw new IllegalArgumentException("Description too long (max 8192 characters)");
            // apparently this is also the actual Canvas character limit for descriptions
        }
        this.description = description;
        this.descriptionLength = (description == null) ? 0 : description.length();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDescriptionLength() {
        return descriptionLength;
    }
}
